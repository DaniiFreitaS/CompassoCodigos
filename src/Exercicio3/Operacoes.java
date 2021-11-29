package Exercicio3;

public class Operacoes {
    private String texto;
    private int divertido;
    private int chateado;

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void verificaSimbolos() {
        for (int i = 0; i < this.texto.length(); i++) {
            if (this.texto.charAt(i) == ':') {
                if(this.texto.charAt(i+1) == '-'){
                    if(this.texto.charAt(i+2) == ')'){
                        divertido++;
                    }else if(this.texto.charAt(i+2) == '('){
                        chateado++;
                    }
                }
            }
        }
    }
    public String Resultado(String texto){
        setTexto(texto);//pega o texto digitado e coloca no objeto
        verificaSimbolos();//faz toda a verificacao sem precisar passar parametros porque o texto ja foi colocado no objeto antes
        String resultado = "";
        if(divertido > chateado){
            resultado = "Divertido";
        }else if(divertido < chateado){
            resultado = "Chateado";
        }else if(divertido == chateado){
            resultado = "Neutro";
        }
        return resultado;
    }
}
