package com.example.doacao_sangue;

public class TipoSangue {

    public String pesquisa(String n) {
        String tipo = "";
        if (n.equals("A+")) {
            // Pode receber doações de A+, A-, O+ e O-.
            tipo = "Pode receber doações de:\n A+, A-,\n O+ e O-.";
        } else if (n.equals("A-")) {
            // Pode receber doações de A- e O-.
            tipo = "Pode receber doações de:\n A- e O-.";
        } else if (n.equals("B+")) {
            // Pode receber doações de B+, B-, O+ e O-.
            tipo = "Pode receber doações de:\n B+, B-,\n O+ e O-.";
        } else if (n.equals("B-")) {
            // Pode receber doações de B- e O-.
            tipo = "Pode receber doações de:\n B- \ne O-.";
        } else if (n.equals("AB+")) {
            // Pode receber doações de A+, A-, B+, B-, O+ e O-.
            tipo = "Pode receber doações de:\n A+, A-,\n B+, B-,\n O+ e O-.";
        } else if (n.equals("AB-")) {
            // Pode receber doações de A-, B- e O-.
            tipo = "Pode receber doações de:\n A-,\n B- \n e O-.";
        } else if (n.equals("O+")) {
            // Pode receber doações de O+ e O-.
            tipo = "Pode receber doações de:\n O+ e O-.";
        } else if (n.equals("O-")) {
            // Pode receber doações de O-.
            tipo = "Pode receber doações de:\n O-.";
        }
        return tipo;
    }
}
