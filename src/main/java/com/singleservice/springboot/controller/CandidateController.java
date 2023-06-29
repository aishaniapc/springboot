package com.singleservice.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.singleservice.springboot.entity.Candidate;
import com.singleservice.springboot.repository.CandidateRepository;


@RestController
public class CandidateController {

	@Autowired
	private CandidateRepository canRepo;

	@PostMapping("/save")
	public Candidate saveCandidate(@RequestBody Candidate c) {
		return canRepo.save(c);
	}
	@GetMapping("/getAll")
	public List<Candidate> getAllCandidates() {
		return canRepo.findAll();
	}
	
	@GetMapping("/getbypath/{id}")
	public Optional<Candidate> getCandidatebyPV(@PathVariable (value = "id")Long id) {
		return this.canRepo.findById(id);
		
	}
	@GetMapping("/getbyRP")
	public Candidate getCandidatebyRP(@RequestParam String aadhar) {
		return canRepo.findCandidateByAadhar(aadhar);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCandidate(@PathVariable ("id") Long Id) {
		Optional<Candidate> c = canRepo.findById(Id);
		if(c.isPresent()) {
		canRepo.deleteById(Id);
		return "Candidate Deleted Successfully";}else {
			return "CandidateId not available";
		}
	}
	@PutMapping("/update/{id}")
	public String updateCandidate(@RequestBody Candidate can, @PathVariable ("id") Long id) {
		if(canRepo.existsById(id)) {
			can.setCandidateId(id);
			canRepo.save(can);
			return "Candidate updated Successfully";}else {
				return "CandidateId not available";
			}
	}
}
