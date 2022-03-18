package lesson30.service;

import lesson30.model.Author;
import lesson30.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }
}
