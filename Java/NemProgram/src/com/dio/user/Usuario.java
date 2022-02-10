package com.dio.user;

public class Usuario extends Pessoa{
    private String user;
    private String password;

    public Usuario(String nome, String nascimento, Double altura, Double peso, String user, String password) {
        super(nome, nascimento, altura, peso);
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome= '" + nome + '\'' +
                ", nascimento= '" + nascimento + '\'' +
                ", altura= " + altura +
                ", peso= " + peso +
                ", user= '" + user + '\'' +
                ", password= '" + password + '\'' +
                '}';
    }
}
