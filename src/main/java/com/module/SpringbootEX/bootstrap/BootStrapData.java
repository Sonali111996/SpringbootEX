package com.module.SpringbootEX.bootstrap;

import com.module.SpringbootEX.domain.Author;
import com.module.SpringbootEX.domain.Book;
import com.module.SpringbootEX.domain.Publisher;
import com.module.SpringbootEX.repositories.AuthorRepository;
import com.module.SpringbootEX.repositories.BookRepository;
import com.module.SpringbootEX.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started bootstrap");
        Publisher publisher=new Publisher();
        publisher.setName("BKS Publication");
        publisher.setCity("Banglore");
        publisher.setState("Karnataka");

        publisherRepository.save(publisher);
        System.out.println("Publisher Count"+publisherRepository.count());

        Author Shenoy =new Author("Pretty","Shenoy");
        Book book=new Book("Secret WishList","123");
        Shenoy.getBooks().add(book);
        book.getAuthors().add(Shenoy);

        authorRepository.save(Shenoy);
        bookRepository.save(book);

        Author christie=new Author("Agatha","Christie");
        Book MOTOE=new Book("MurderOnTheOrientExpress","1234");
        christie.getBooks().add(MOTOE);
        MOTOE.getAuthors().add(christie);
        authorRepository.save(christie);
        bookRepository.save(MOTOE);
        System.out.println("Number of Books"+bookRepository.count());

    }
}
