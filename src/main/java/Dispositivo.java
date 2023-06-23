class Dispositivo {
    private String marca;
    private int memoriaRAM;
    private int memoriaAlmacenamiento;
    private String procesador;
    private String modelo;
    private int añoFabricacion;
    private double precio;
    private int stock;

    public Dispositivo() {
    }

        public String getMarca () {
            return marca;
        }

        public void setMarca (String marca){
            this.marca = marca;
        }

        public int getMemoriaRAM () {
            return memoriaRAM;
        }

        public void setMemoriaRAM ( int memoriaRAM){
            this.memoriaRAM = memoriaRAM;
        }

        public int getMemoriaAlmacenamiento () {
            return memoriaAlmacenamiento;
        }

        public void setMemoriaAlmacenamiento ( int memoriaAlmacenamiento){
            this.memoriaAlmacenamiento = memoriaAlmacenamiento;
        }

        public String getProcesador () {
            return procesador;
        }

        public void setProcesador (String procesador){
            this.procesador = procesador;
        }

        public String getModelo () {
            return modelo;
        }

        public void setModelo (String modelo){
            this.modelo = modelo;
        }

        public int getAñoFabricacion () {
            return añoFabricacion;
        }

        public void setAñoFabricacion ( int añoFabricacion){
            this.añoFabricacion = añoFabricacion;
        }

        public double getPrecio () {
            return precio;
        }

        public void setPrecio ( double precio){
            this.precio = precio;
        }

        public int getStock () {
            return stock;
        }

        public void setStock ( int stock){
            this.stock = stock;
        }
    }
