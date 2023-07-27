package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.paciente.DadosDoPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {


    @Autowired
    PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarPacientes(@RequestBody @Valid DadosDoPaciente dadosDoPaciente){
            repository.save(new Paciente(dadosDoPaciente));
    }


}
