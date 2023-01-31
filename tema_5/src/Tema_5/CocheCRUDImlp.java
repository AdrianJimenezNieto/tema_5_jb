package Tema_5;

public class CocheCRUDImlp implements CocheCRUD{
    String nombre;
    String marcha;
    int precio;

    public CocheCRUDImlp(String nombre, String marcha, int precio) {
        this.nombre = nombre;
        this.marcha = marcha;
        this.precio = precio;
    }

    @Override
    public void save() {
        System.out.println("Estoy en save de CocheCRUDImpl");
    }

    @Override
    public void findAll() {
        System.out.println("Estoy en findAll de CocheCRUDImpl");
    }

    @Override
    public void delete() {
        System.out.println("Estoy en delete de CocheCRUDImpl");
    }
}
