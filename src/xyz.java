abstract class xyz {

        private Integer weight;
        public xyz(int weight) {
            weight = weight;
        }
        public Integer getWeight() {
            return this.weight;
        }
    }

    class Cat extends xyz {
        Cat(int weight) {
            super(weight);
        }
    }

    class TestCat {
        public static void main(String[] args) {
            xyz a = new Cat(10);
            System.out.println("Cat weight : " + a.getWeight());
        }
    }

