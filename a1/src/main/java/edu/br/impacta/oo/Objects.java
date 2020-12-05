package edu.br.impacta.oo;

interface Thinker {
    String think();
}

class Person implements Thinker {
    private String name;
    private String cpf;

    public Person() {
    }

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public String think() {
        return "smart person thinking...";
    }

    // amigo daqui pra frente só getter e setter
    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

class SmartPerson extends Person {
    public SmartPerson() {
    }

    public SmartPerson(String name, String cpf) {
        super(name, cpf);
    }

    @Override
    public String think() {
        return "smart person thinking...";
    }
}

public class Objects {
    public static void playOO() {
        var p = new Person("Um nome qualquer", "444");
        p.setCpf("333");
        System.out.println(p.think());
        System.out.println(p);

        var sp = new SmartPerson("Nova pessoa", "555");
        p.setCpf("9999");
        System.out.println(sp.think());
        System.out.println(sp);
    }
}
