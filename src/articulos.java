class articulos {
        private int precio;
        private String nombres;

        public articulos(int precio, String nombres) {
            this.precio = precio;
            this.nombres = nombres;
        }

        @Override
        public String toString() {
            return precio + nombres;
        }
    }
