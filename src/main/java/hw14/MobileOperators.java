package hw14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MobileOperators {
    Megafon(List.of("920","921","922","923","924","925","926","927","928","929")),
    Beeline(List.of("903","905","906","909","910")),
    MTS(List.of("910","912","913","914","916","917")),
    Tele2(List.of("900","901","902","908","953","958","977"));


    static {
 ALLCODES = Arrays.stream(values()).map(MobileOperators::getPhoneCodes).flatMap(List::stream).collect(Collectors.toList());
    }

    private static final List<String> ALLCODES;

    private final List<String> phoneCodes;

    MobileOperators(List<String> phoneCodes) {
        this.phoneCodes = phoneCodes;
    }

    MobileOperators(String... phoneCodes) {
        this.phoneCodes = Arrays.asList(phoneCodes);
    }

    public List<String> getPhoneCodes() {
        return phoneCodes;
    }

    public static String generateCode(){
        return ALLCODES.get(new Random().nextInt(ALLCODES.size()));
    }
}
