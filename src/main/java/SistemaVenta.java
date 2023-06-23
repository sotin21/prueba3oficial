public class SistemaVentaComponentes {
    private List<Cliente> clientes;
    private List<Dispositivo> dispositivo;

    public SistemaVentaComponentes() {
        clientes = new ArrayList<>();
        dispositivo = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
            System.out.println("Cliente agregado.");
        } else {
            System.out.println("El cliente ya existe en el sistema.");
        }
    }

    public void agregarDispositivoTecnologico(Dispositivo dispositivo) {
        dispositivo.add(dispositivo);
        System.out.println("Dispositivo agregado correctamente.");
    }

    public Dispositivo obtenerInformacionDispositivo(String modelo) {
        for (Dispositivo dispositivo : dispositivo) {
            if (dispositivo.getModelo().equals(modelo)) {
                return dispositivo;
            }
        }
        return null;
    }

    public List<Dispositivo> buscarDispositivosPorMarca(String marca) {
        List<Dispositivo> dispositivosPorMarca = new ArrayList<>();
        for (Dispositivo dispositivo : dispositivo) {
            if (dispositivo.getMarca().equals(marca)) {
                dispositivosPorMarca.add(dispositivo);
            }
        }
        return dispositivosPorMarca;
    }

    public List<Dispositivo> buscarDispositivosPorModeloYTipo(String modelo, String tipo) {
        List<Dispositivo> dispositivosPorModeloYTipo = new ArrayList<>();
        for (Dispositivo dispositivo : dispositivo) {
            if (dispositivo.getModelo().equals(modelo) && dispositivo.getClass().getSimpleName().equals(tipo)) {
                dispositivosPorModeloYTipo.add(dispositivo);
            }
        }
        return dispositivosPorModeloYTipo;
    }

    public static void main(String[] args) {
        SistemaVentaComponentes sistema = new SistemaVentaComponentes();

        Cliente cliente1 = new Cliente("Juan", "Perez", "juanito69@gmail.com", "123456789", "Soltero", "Santiago");
        Cliente cliente2 = new Cliente("Maria", "Juana", "maria@gmail.com", "987654321", "Casada", "Temuco");
        sistema.agregarCliente(cliente1);
        sistema.agregarCliente(cliente2);

        Computadores computadora1 = new Computadores();
        computadora1.setMarca("HP");
        computadora1.setModelo("ABC123");
        computadora1.setPrecio(1500.0);
        computadora1.setStock(5);

        Notebooks notebook1 = new Notebooks();
        notebook1.setMarca("Lenovo");
        notebook1.setModelo("XYZ456");
        notebook1.setPrecio(2000.0);
        notebook1.setStock(3);

        Tablet tablet1 = new Tablet();
        tablet1.setMarca("Samsung");
        tablet1.setModelo("123XYZ");
        tablet1.setPrecio(800.0);
        tablet1.setStock(10);

        sistema.agregarDispositivoTecnologico(computadora1);
        sistema.agregarDispositivoTecnologico(notebook1);
        sistema.agregarDispositivoTecnologico(tablet1);

        Dispositivo = sistema.obtenerInformacionDispositivo("ABC123");
        if (dispositivo != null) {

            System.out.println("Información del dispositivo:");
            System.out.println("Marca: " + dispositivo.getMarca());
            System.out.println("Modelo: " + dispositivo.getModelo());
        } else {
            System.out.println("No se encontró el dispositivo con el modelo especificado.");
        }

        List<Dispositivo> dispositivosPorMarca = sistema.buscarDispositivosPorMarca("HP");
        if (!dispositivosPorMarca.isEmpty()) {
            System.out.println("Dispositivos encontrados:");
            for (Dispositivo disp : dispositivosPorMarca) {
                System.out.println("Marca: " + disp.getMarca());
                System.out.println("Modelo: " + disp.getModelo());
            }
        } else {
            System.out.println("No se encontraron dispositivos de la marca especificada.");
        }

        List<Dispositivo> dispositivosPorModeloYTipo = sistema.buscarDispositivosPorModeloYTipo("ABC123", "Notebook");
        if (!dispositivosPorModeloYTipo.isEmpty()) {
            System.out.println("Dispositivos encontrados:");
            for (Dispositivo disp : dispositivosPorModeloYTipo) {

                System.out.println("Marca: " + disp.getMarca());
                System.out.println("Modelo: " + disp.getModelo());
                // Mostrar el resto de las propiedades del dispositivo
            }
        } else {
            System.out.println("No se encontraron dispositivos con el modelo y tipo de producto especificados.");
        }
    }
}