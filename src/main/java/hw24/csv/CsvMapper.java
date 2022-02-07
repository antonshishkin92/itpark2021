package hw24.csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import hw24.dto.AuthorAndBoook;
import lombok.experimental.UtilityClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class CsvMapper {
    public List<AuthorAndBoook> getBookInfo() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(CsvMapper.class.getResourceAsStream("/books.csv")))) {
            CsvToBean<AuthorAndBoook> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(AuthorAndBoook.class)
                    .withSeparator(';')
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            return csvToBean.stream().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
