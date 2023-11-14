public class Usuario {//Creamos una clase llamada "Usuario"
    private String name;//Creamos el atributo name
    private String second_name;//Creamos el atributo secondo_name
    private Integer postal_code;//Creamos el atributo postal_code
    private String address;//Creamos el atributo address
    private String email;//Creamos el atributo email
    private Integer password;//Creamos el atributo password

    public Usuario(String n, String s, Integer c, String a, String e, Integer p) {//Aqui creamos el contructor, asociando los atributos a variables
        this.name = n;
        this.second_name = s;
        this.postal_code = c;
        this.address = a;
        this.email = e;
        this.password = p;
    }

    public String getName() {
        return this.name;
    }//Método para devolver el contenido de la variable

    public void setName(String n) {//Método para modificar el contenido de la variable
        this.name = n;
    }

    public String getSecond_name() {//Método para devolver el contenido de la variable
        return second_name;
    }

    public void setSecond_name(String second_name) {//Método para modificar el contenido de la variable
        this.second_name = second_name;
    }

    public Integer getCodigo_postal() {//Método para devolver el contenido de la variable
        return postal_code;
    }

    public void setCodigo_postal(Integer codigo_postal) {//Método para modificar el contenido de la variable
        this.postal_code = codigo_postal;
    }

    public String getAddress() {//Método para devolver el contenido de la variable
        return address;
    }

    public void setAddress(String address) {//Método para modificar el contenido de la variable
        this.address = address;
    }

    public String getEmail() {//Método para devolver el contenido de la variable
        return email;
    }

    public void setEmail(String email) {//Método para modificar el contenido de la variable
        this.email = email;
    }

    public Integer getPassword() {//Método para devolver el contenido de la variable
        return password;
    }

    public void setPassword(Integer password) {//Método para modificar el contenido de la variable
        this.password = password;
    }

    public boolean check(String name, Integer pass) {//El método check comparará el usuario y la contraseña de los registros con los introducidos por el usuario
        boolean res = Boolean.FALSE;
        if (this.name.equals(name) && this.password.equals(pass)) {//Si coinciden
            System.out.println("Correcto");//Imprimirá en pantalla este mensaje
            res = Boolean.TRUE;

        } else {
            System.out.println("Error");//Si no, este
        }
        return res;
    }

    public boolean check2(String name, Integer pass) {//El método check comparará el usuario y la contraseña de los registros con los introducidos por el usuario
        boolean res = Boolean.FALSE;
        if (this.name.equals(name) && this.password.equals(pass)) {//Si coinciden
            System.out.println("Correcto");//Imprimirá en pantalla este mensaje
            res = Boolean.TRUE;

        } else {
            System.out.println("Error");//Si no, este
        }
        return res;
    }
}