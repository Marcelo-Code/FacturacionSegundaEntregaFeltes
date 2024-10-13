package com.segundaPreEntregaJava.segundaPreEntregaJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.segundaPreEntregaJava.segundaPreEntregaJava.Model.Auto;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Model.Categoria;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Service.AutoService;
import com.segundaPreEntregaJava.segundaPreEntregaJava.Service.CategoriaService;

@SpringBootApplication
public class SegundaPreEntregaJavaApplication implements CommandLineRunner {

	@Autowired
	AutoService autoService;

	@Autowired
	CategoriaService categoriaService;

	public static void main(String[] args) {
		SpringApplication.run(SegundaPreEntregaJavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Definimos Categorías

		Categoria c1 = new Categoria("Sedán", "Auto de tres volúmenes, cómodo y espacioso para familias.");
		Categoria c2 = new Categoria("SUV", "Vehículo alto y robusto, versátil para diversos terrenos.");
		Categoria c3 = new Categoria("Hatchback", "Auto compacto con cinco puertas, ideal para ciudad.");
		Categoria c4 = new Categoria("Deportivo", "Auto enfocado en velocidad y rendimiento.");
		Categoria c5 = new Categoria("Camioneta (Pickup)",
				"Vehículo con cabina y área de carga, útil para trabajo y ocio.");
		Categoria c6 = new Categoria("Coupé", "Auto de dos puertas y diseño elegante, con un enfoque en el estilo.");
		Categoria c7 = new Categoria("Convertible", "Auto descapotable, ideal para disfrutar del aire libre.");
		Categoria c8 = new Categoria("Monovolumen",
				"Vehículo espacioso con múltiples asientos, perfecto para familias grandes.");
		Categoria c9 = new Categoria("Compacto", "Auto pequeño y eficiente, fácil de manejar y estacionar.");
		Categoria c10 = new Categoria("Todoterreno",
				"Vehículo diseñado para manejar terrenos difíciles, como barro y rocas.");

		// Damos de alta categorías en SQL

		this.categoriaService.altaCategoria(c1);
		this.categoriaService.altaCategoria(c2);
		this.categoriaService.altaCategoria(c3);
		this.categoriaService.altaCategoria(c4);
		this.categoriaService.altaCategoria(c5);
		this.categoriaService.altaCategoria(c6);
		this.categoriaService.altaCategoria(c7);
		this.categoriaService.altaCategoria(c8);
		this.categoriaService.altaCategoria(c9);
		this.categoriaService.altaCategoria(c10);

		// Definimos autos

		Auto a1 = new Auto("Toyota", "Corolla", 2020, 20000.00, c1);
		Auto a2 = new Auto("Ford", "Focus", 2019, 18000.00, c1);
		Auto a3 = new Auto("Volkswagen", "Vento", 2021, 22000.00, c1);
		Auto a4 = new Auto("Chevrolet", "Onix", 2022, 16000.00, c1);
		Auto a5 = new Auto("Honda", "CR-V", 2021, 30000.00, c2);
		Auto a6 = new Auto("Nissan", "Kicks", 2020, 25000.00, c2);
		Auto a7 = new Auto("Peugeot", "3008", 2022, 35000.00, c2);
		Auto a8 = new Auto("Jeep", "Compass", 2023, 40000.00, c2);
		Auto a9 = new Auto("Volkswagen", "Polo", 2020, 15000.00, c3);
		Auto a10 = new Auto("Renault", "Sandero", 2019, 14000.00, c3);
		Auto a11 = new Auto("Fiat", "Argo", 2021, 15500.00, c3);
		Auto a12 = new Auto("Toyota", "Yaris", 2022, 17500.00, c3);
		Auto a13 = new Auto("Ford", "Mustang", 2021, 45000.00, c4);
		Auto a14 = new Auto("Chevrolet", "Camaro", 2020, 48000.00, c4);
		Auto a15 = new Auto("Porsche", "911", 2022, 90000.00, c4);
		Auto a16 = new Auto("Nissan", "Z", 2023, 60000.00, c4);
		Auto a17 = new Auto("Toyota", "Hilux", 2021, 40000.00, c5);
		Auto a18 = new Auto("Ford", "Ranger", 2022, 38000.00, c5);
		Auto a19 = new Auto("Chevrolet", "S10", 2020, 35000.00, c5);
		Auto a20 = new Auto("Volkswagen", "Amarok", 2021, 42000.00, c5);
		Auto a21 = new Auto("Audi", "A5", 2022, 50000.00, c6);
		Auto a22 = new Auto("Mercedes-Benz", "C-Class", 2021, 55000.00, c6);
		Auto a23 = new Auto("BMW", "Serie 4", 2023, 60000.00, c6);
		Auto a24 = new Auto("Volkswagen", "Scirocco", 2019, 25000.00, c6);
		Auto a25 = new Auto("Mini", "Cooper", 2020, 30000.00, c7);
		Auto a26 = new Auto("Fiat", "500", 2021, 25000.00, c7);
		Auto a27 = new Auto("Mazda", "MX-5", 2022, 35000.00, c7);
		Auto a28 = new Auto("BMW", "Z4", 2023, 65000.00, c7);
		Auto a29 = new Auto("Renault", "Kangoo", 2021, 20000.00, c8);
		Auto a30 = new Auto("Peugeot", "Partner", 2022, 21000.00, c8);

		// Damos de alta autos en SQL

		this.autoService.altaAuto(a1);
		this.autoService.altaAuto(a2);
		this.autoService.altaAuto(a3);
		this.autoService.altaAuto(a4);
		this.autoService.altaAuto(a5);
		this.autoService.altaAuto(a6);
		this.autoService.altaAuto(a7);
		this.autoService.altaAuto(a8);
		this.autoService.altaAuto(a9);
		this.autoService.altaAuto(a10);
		this.autoService.altaAuto(a11);
		this.autoService.altaAuto(a12);
		this.autoService.altaAuto(a13);
		this.autoService.altaAuto(a14);
		this.autoService.altaAuto(a15);
		this.autoService.altaAuto(a16);
		this.autoService.altaAuto(a17);
		this.autoService.altaAuto(a18);
		this.autoService.altaAuto(a19);
		this.autoService.altaAuto(a20);
		this.autoService.altaAuto(a21);
		this.autoService.altaAuto(a22);
		this.autoService.altaAuto(a23);
		this.autoService.altaAuto(a24);
		this.autoService.altaAuto(a25);
		this.autoService.altaAuto(a26);
		this.autoService.altaAuto(a27);
		this.autoService.altaAuto(a28);
		this.autoService.altaAuto(a29);
		this.autoService.altaAuto(a30);

		// List<Auto> lista = new ArrayList<>();

		// Busco una lista de autos en una marca en particular

		// System.out.println("---------------------");
		// System.out.println("Lista de autos Toyota");
		// System.out.println("---------------------");

		// lista = this.autoService.buscarPorMarca("Toyota");

		// for (Auto d : lista) {
		// System.out.println(d.toString());
		// }

		// System.out.println("----------------------------------");
		// System.out.println("Muestro la lista de autos completa");
		// System.out.println("----------------------------------");

		// for (Auto d : this.autoService.mostrarAutos()) {
		// System.out.println(d.toString());
		// }

		// System.out.println("-----------------------------------------");
		// System.out.println("Muestro la lista de autos anterior a 2022");
		// System.out.println("-----------------------------------------");

		// for (Auto d : this.autoService.buscarAnioMenor(2022)) {
		// System.out.println(d.toString());
		// }

		// System.out.println("------------------------------------------");
		// System.out.println("Muestro la lista de autos posterior a 2020");
		// System.out.println("------------------------------------------");

		// for (Auto d : this.autoService.buscarAnioMayor(2020)) {
		// System.out.println(d.toString());
		// }

		// // Elimino el auto con id = 1, en este caso Toyota Corolla

		// this.autoService.eliminarAutoPorId(1);

		// System.out.println("------------------------------------------");
		// System.out.println("Muestro la lista de categorías disponibles");
		// System.out.println("------------------------------------------");

		// for (Categoria c : this.categoriaService.mostrarCategorias()) {
		// System.out.println(c.toString());
		// }
	}
}