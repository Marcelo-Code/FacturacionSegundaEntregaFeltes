# **Segunda Pre Entrega Java**
## **Proyecto API REST - Autos y Categorías:**
### **Descripción:**

Esta API REST permite gestionar autos y categorías, proporcionando operaciones CRUD (Crear, Leer, Actualizar, Eliminar) tanto para autos como para categorías en modelo MVC.

### **Datos Internos:**

El proyecto cuenta con un conjunto de autos y categorías precargadas que pueden ser gestionadas a través de los endpoints.

#### **Autos:**
<details>
<summary>Click para ver detalles</summary>


```
[

    {
        "id": 1,
        "marca": "Toyota",
        "modelo": "Corolla",
        "anio": 2020,
        "precio": 20000.0,
        "categoriaId": 1,
        "categoria": "Sedán"
    },
    {
        "id": 2,
        "marca": "Ford",
        "modelo": "Focus",
        "anio": 2019,
        "precio": 18000.0,
        "categoriaId": 1,
        "categoria": "Sedán"
    },
    {
        "id": 3,
        "marca": "Volkswagen",
        "modelo": "Vento",
        "anio": 2021,
        "precio": 22000.0,
        "categoriaId": 1,
        "categoria": "Sedán"
    },
    {
        "id": 4,
        "marca": "Chevrolet",
        "modelo": "Onix",
        "anio": 2022,
        "precio": 16000.0,
        "categoriaId": 1,
        "categoria": "Sedán"
    },
    {
        "id": 5,
        "marca": "Honda",
        "modelo": "CR-V",
        "anio": 2021,
        "precio": 30000.0,
        "categoriaId": 2,
        "categoria": "SUV"
    },
    {
        "id": 6,
        "marca": "Nissan",
        "modelo": "Kicks",
        "anio": 2020,
        "precio": 25000.0,
        "categoriaId": 2,
        "categoria": "SUV"
    },
    {
        "id": 7,
        "marca": "Peugeot",
        "modelo": "3008",
        "anio": 2022,
        "precio": 35000.0,
        "categoriaId": 2,
        "categoria": "SUV"
    },
    {
        "id": 8,
        "marca": "Jeep",
        "modelo": "Compass",
        "anio": 2023,
        "precio": 40000.0,
        "categoriaId": 2,
        "categoria": "SUV"
    },
    {
        "id": 9,
        "marca": "Volkswagen",
        "modelo": "Polo",
        "anio": 2020,
        "precio": 15000.0,
        "categoriaId": 3,
        "categoria": "Hatchback"
    },
    {
        "id": 10,
        "marca": "Renault",
        "modelo": "Sandero",
        "anio": 2019,
        "precio": 14000.0,
        "categoriaId": 3,
        "categoria": "Hatchback"
    },
    {
        "id": 11,
        "marca": "Fiat",
        "modelo": "Argo",
        "anio": 2021,
        "precio": 15500.0,
        "categoriaId": 3,
        "categoria": "Hatchback"
    },
    {
        "id": 12,
        "marca": "Toyota",
        "modelo": "Yaris",
        "anio": 2022,
        "precio": 17500.0,
        "categoriaId": 3,
        "categoria": "Hatchback"
    },
    {
        "id": 13,
        "marca": "Ford",
        "modelo": "Mustang",
        "anio": 2021,
        "precio": 45000.0,
        "categoriaId": 4,
        "categoria": "Deportivo"
    },
    {
        "id": 14,
        "marca": "Chevrolet",
        "modelo": "Camaro",
        "anio": 2020,
        "precio": 48000.0,
        "categoriaId": 4,
        "categoria": "Deportivo"
    },
    {
        "id": 15,
        "marca": "Porsche",
        "modelo": "911",
        "anio": 2022,
        "precio": 90000.0,
        "categoriaId": 4,
        "categoria": "Deportivo"
    },
    {
        "id": 16,
        "marca": "Nissan",
        "modelo": "Z",
        "anio": 2023,
        "precio": 60000.0,
        "categoriaId": 4,
        "categoria": "Deportivo"
    },
    {
        "id": 17,
        "marca": "Toyota",
        "modelo": "Hilux",
        "anio": 2021,
        "precio": 40000.0,
        "categoriaId": 5,
        "categoria": "Camioneta (Pickup)"
    },
    {
        "id": 18,
        "marca": "Ford",
        "modelo": "Ranger",
        "anio": 2022,
        "precio": 38000.0,
        "categoriaId": 5,
        "categoria": "Camioneta (Pickup)"
    },
    {
        "id": 19,
        "marca": "Chevrolet",
        "modelo": "S10",
        "anio": 2020,
        "precio": 35000.0,
        "categoriaId": 5,
        "categoria": "Camioneta (Pickup)"
    },
    {
        "id": 20,
        "marca": "Volkswagen",
        "modelo": "Amarok",
        "anio": 2021,
        "precio": 42000.0,
        "categoriaId": 5,
        "categoria": "Camioneta (Pickup)"
    },
    {
        "id": 21,
        "marca": "Audi",
        "modelo": "A5",
        "anio": 2022,
        "precio": 50000.0,
        "categoriaId": 6,
        "categoria": "Coupé"
    },
    {
        "id": 22,
        "marca": "Mercedes-Benz",
        "modelo": "C-Class",
        "anio": 2021,
        "precio": 55000.0,
        "categoriaId": 6,
        "categoria": "Coupé"
    },
    {
        "id": 23,
        "marca": "BMW",
        "modelo": "Serie 4",
        "anio": 2023,
        "precio": 60000.0,
        "categoriaId": 6,
        "categoria": "Coupé"
    },
    {
        "id": 24,
        "marca": "Volkswagen",
        "modelo": "Scirocco",
        "anio": 2019,
        "precio": 25000.0,
        "categoriaId": 6,
        "categoria": "Coupé"
    },
    {
        "id": 25,
        "marca": "Mini",
        "modelo": "Cooper",
        "anio": 2020,
        "precio": 30000.0,
        "categoriaId": 7,
        "categoria": "Convertible"
    },
    {
        "id": 26,
        "marca": "Fiat",
        "modelo": "500",
        "anio": 2021,
        "precio": 25000.0,
        "categoriaId": 7,
        "categoria": "Convertible"
    },
    {
        "id": 27,
        "marca": "Mazda",
        "modelo": "MX-5",
        "anio": 2022,
        "precio": 35000.0,
        "categoriaId": 7,
        "categoria": "Convertible"
    },
    {
        "id": 28,
        "marca": "BMW",
        "modelo": "Z4",
        "anio": 2023,
        "precio": 65000.0,
        "categoriaId": 7,
        "categoria": "Convertible"
    },
    {
        "id": 29,
        "marca": "Renault",
        "modelo": "Kangoo",
        "anio": 2021,
        "precio": 20000.0,
        "categoriaId": 8,
        "categoria": "Monovolumen"
    },
    {
        "id": 30,
        "marca": "Peugeot",
        "modelo": "Partner",
        "anio": 2022,
        "precio": 21000.0,
        "categoriaId": 8,
        "categoria": "Monovolumen"
    }
]
```
</details>


#### **Categorías:**
<details>
<summary>Click para ver detalles</summary>

```
[

    {
        "id": 1,
        "nombre": "Sedán",
        "descripcion": "Auto de tres volúmenes, cómodo y espacioso para familias."
    },
    {
        "id": 2,
        "nombre": "SUV",
        "descripcion": "Vehículo alto y robusto, versátil para diversos terrenos."
    },
    {
        "id": 3,
        "nombre": "Hatchback",
        "descripcion": "Auto compacto con cinco puertas, ideal para ciudad."
    },
    {
        "id": 4,
        "nombre": "Deportivo",
        "descripcion": "Auto enfocado en velocidad y rendimiento."
    },
    {
        "id": 5,
        "nombre": "Camioneta (Pickup)",
        "descripcion": "Vehículo con cabina y área de carga, útil para trabajo y ocio."
    },
    {
        "id": 6,
        "nombre": "Coupé",
        "descripcion": "Auto de dos puertas y diseño elegante, con un enfoque en el estilo."
    },
    {
        "id": 7,
        "nombre": "Convertible",
        "descripcion": "Auto descapotable, ideal para disfrutar del aire libre."
    },
    {
        "id": 8,
        "nombre": "Monovolumen",
        "descripcion": "Vehículo espacioso con múltiples asientos, perfecto para familias grandes."
    },
    {
        "id": 9,
        "nombre": "Compacto",
        "descripcion": "Auto pequeño y eficiente, fácil de manejar y estacionar."
    },
    {
        "id": 10,
        "nombre": "Todoterreno",
        "descripcion": "Vehículo diseñado para manejar terrenos difíciles, como barro y rocas."
    }
]
```
</details>

### **Endpoints:**

#### **Categorías:**
* GET /categorias/getcategorias: Obtiene todas las categorías.
* POST /categorias/createcategoria: Crea una nueva categoría.
* DELETE /categorias/deletecategoria/{id}: Elimina una categoría por su ID.
* PUT /categorias/modifycategoria: Modifica una categoría existente.

#### **Autos:**
* GET /autos/getautos: Obtiene todos los autos.
* POST /autos/createauto: Crea un nuevo auto.
* DELETE /autos/deleteauto/{id}: Elimina un auto por su ID.
* PUT /autos/modifyauto: Modifica un auto existente.

