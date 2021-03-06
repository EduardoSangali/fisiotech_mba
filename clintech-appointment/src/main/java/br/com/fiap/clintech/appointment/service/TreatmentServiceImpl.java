package br.com.fiap.clintech.appointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.clintech.appointment.dao.bean.Treatment;
import br.com.fiap.clintech.appointment.dao.repository.TreatmentRepository;

@Service
public class TreatmentServiceImpl implements TreatmentService {
	@Autowired
	private TreatmentRepository repository;

	@Override
	public void saveTreatment(Treatment treatment) {
		this.repository.save(treatment);
	}

	@Override
	public Treatment getTreatment(Long id) {
		return this.repository.findById(id).get();
	}

	@Override
	public void deleteTreatment(Treatment treatment) {
		this.repository.delete(treatment);
	}

	@Override
	public List<Treatment> getTreatmentsByPatient(Long id) {
		return this.repository.findByPatientId(id);
	}

}
