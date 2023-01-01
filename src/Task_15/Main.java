package Task_15;

class Phone {

    String model;

        Phone(String newModel) {
            this.model = newModel;
        }

        String getModel() {
            return this.model;
        }

    }

// q: А правильно ли описывать сразу 2 класса в одном *.java-файле? IDEA это понимает и не ругнулась при запуске.
//    Но какие тут правила хорошего тона - несколько классов в одном файле, или отдельный файл для каждого класса?
class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }