public class Coffee {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public Coffee() {
    }

    public Coffee(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        if (agua >= 5000 && agua <= 5000){
            this.agua = agua;
        }else{
            System.out.println("No hay agua suficiente");
        }

    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        if (cafe >= 1000 && cafe <= 1000){
            this.cafe = cafe;
        }else{
            System.out.println("No hay café suficiente");
        }

    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        if (crema >= 1500 && crema <= 1500){
            this.crema = crema;
        }else{
            System.out.println("No hay crema suficiente");
        }

    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        if (vasos >= 50 && vasos <= 50){
            this.vasos = vasos;
        }else {
            System.out.println("Ya no hay vasos disponibles");
        }

    }

    @Override
    public String toString() {
        return "Coffee{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }
    public void americano(){
        if (getAgua() >= 180 && getCafe() >= 15 && getVasos() >= 1){
            agua = 180;
            cafe = 15;
            vasos = 1;
        }else{
            System.out.println("Ingredientes insuficientes");
        }
    }
    public void expreso(){
        if (getAgua() >= 120 && getCafe() >= 20 && getVasos() >= 1){
            agua = 120;
            cafe = 20;
            vasos = 1;
        }else{
            System.out.println("Ingredientes insuficientes");
        }
    }
    public void capuchino(){
        if (getAgua() >= 100 && getCafe() >=14 && getVasos() >=1 && getCrema() >= 70){
            agua = 100;
            cafe = 14;
            vasos = 1;
            crema = 70;
        }else{
            System.out.println("Ingredientes insuficientes");
        }
    }
    public boolean ingredientes(){
        return getAgua() >= 100 && getCafe() >= 14 && getVasos() >= 1 && getCrema() >= 70;
    }
    public boolean ingredientes2(String tipoCafe){
        switch (tipoCafe){
            case "americano" -> {
                return getAgua() < 180 || getCafe() < 15 || getVasos() < 1;
            }
            case "expreso" -> {
                return getAgua() < 120 || getCafe() < 20 || getVasos() < 1;
            }
            case "capuchino" -> {
                return getAgua() < 100 || getCafe() < 14 || getVasos() < 1 || getCrema() < 70;
            }
        }
        return false;
    }
    public boolean allingredientes(){
        return getAgua() < 100 || getCafe() < 14 || getVasos() < 1 || getCrema() < 70;
    }
}



