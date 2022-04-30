package br.com.dio;

import br.com.dio.model.Cat;

public class FirstProgram {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;

        System.out.println("Hello World! " + (a+b) );*/

        Cat cat = new Cat();
        Book book = new Book("Clean Code", 200);

        System.out.println(book);
        System.out.println(cat);
    }
}

class Book {
    private String name;
    private Integer pagesNum;

    public Book(String name, Integer pagesNum) {
        this.name = name;
        this.pagesNum = pagesNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPagesNum() {
        return pagesNum;
    }

    public void setPagesNum(Integer pagesNum) {
        this.pagesNum = pagesNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pagesNum=" + pagesNum +
                '}';
    }
}
