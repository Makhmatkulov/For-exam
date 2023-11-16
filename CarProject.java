public class CarProject {
    public static class Car {
        public void getColor(String color) {
            System.out.println(color);
        }

        public void getModel(String model) {
            System.out.println(model);
        }

        public void isAuto(String auto) {
            System.out.println(auto);
        }
    }

    public static void main(String[] args) {
        Car ford = new Car();
        ford.getColor("Black");
        ford.getModel("Escort");
        ford.isAuto("Auto");
        Car tesla = new Car();
        tesla.getColor("White");
        tesla.getModel("Model 3");
        tesla.isAuto("Auto");
    }
}