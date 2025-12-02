package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entity.Empleado;
import com.app.web.servicio.EmpleadoServicio;

@Controller
public class EmpleadosControlador {

	@Autowired
	private EmpleadosServicio servicio;

	@GetMapping({ "/estudiantes", "/" })
	public String listarEstudiantes(Model modelo) {
		modelo.addAttribute("estudiantes", servicio.listarTodosLosEmpleados());
		return "empleados"; // nos retorna al archivo estudiantes
	}

	@GetMapping("/empleado/nuevo")
	public String mostrarFormularioDeRegistrtarEmpleados(Model modelo) {
		Empleado empleado = new Empleado();
		modelo.addAttribute("empleado", empleado);
		return "crear_empleado";
	}

	@PostMapping("/empleados")
	public String guardarEmpleado(@ModelAttribute("empleado") Empleado empelado) {
		servicio.guardarEmpleado(empleado);
		return "redirect:/empleado";
	}

	@GetMapping("/empleado/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("estudiante", servicio.obtenerEmpleadoPorId(id));
		return "editar_empleado";
	}

	@PostMapping("/empleados/{id}")
	public String actualizarEmpleado(@PathVariable Long id, @ModelAttribute("empleado") Empleado estudiante,
			Model modelo) {
		Empleado empleadoExistente = servicio.obtenerEmpleadoPorId(id);
		empleadoExistente.setId(id);
		empleadoExistente.setNombre(empleado.getNombre());
		empleadoExistente.setApellido(empleado.getApellido());
		empleadoExistente.setEmail(empleado.getEmail());

		servicio.actualizarEmpleado(empleadoExistente);
		return "redirect:/empleado";
	}

	@GetMapping("/empleado/{id}")
	public String eliminarEmpleado(@PathVariable Long id) {
		servicio.eliminarEmpleado(id);
		return "redirect:/eempleados";
	}
}
