class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Numero sumar(Numero otroNumero) {
        int resultado = this.valor + otroNumero.getValor();
        return new Numero(resultado);
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }

    public static void main(String[] args) {
        Numero numero1 = new Numero(5);
        Numero numero2 = new Numero(10);

        Numero resultado = numero1.sumar(numero2);

        System.out.println("La suma es: " + resultado);
    }
}
