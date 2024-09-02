package co.edu.uniquindio.poo;


    public class Contacto {
        public String nombre;
        public String alias;
        public String direc;
        public String telf;
        public String email;
        public Contacto(String nombre,String alias, String direc, String telf, String email){
            this.nombre=nombre;
            this.alias=alias;
            this.direc=direc;
            this.telf=telf;
            this.email=email;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getAlias() {
            return alias;
        }
        public void setAlias(String alias) {
            this.alias = alias;
        }
        public String getDirec() {
            return direc;
        }
        public void setDirec(String direc) {
            this.direc = direc;
        }
        public String getTelf() {
            return telf;
        }
        public void setTelf(String telf) {
            this.telf = telf;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        @Override
        public String toString() {
        
            return "Contacto [nombre=" + nombre + ", alias=" + alias + ", direc=" + direc+" , telf=" + telf + ", email=" + email + "]";
        }
    }

