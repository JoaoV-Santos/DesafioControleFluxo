public class ParametrosInvalidosException extends Exception{
        private int parametroUm;
        private int parametroDois;

    @Override
    public String toString() {
        return "O segundo parâmetro deve ser maior que o primeiro";
    }

    public ParametrosInvalidosException(int parametroUm, int parametroDois) {
            super();
            this.parametroUm = parametroUm;
            this.parametroDois = parametroDois;
        }

}
