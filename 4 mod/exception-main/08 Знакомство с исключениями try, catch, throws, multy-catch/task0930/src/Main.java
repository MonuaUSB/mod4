import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  Логирование состояний и ошибок в работе программы.
 *  Напишите метод, который выбрасывает проверяемое исключение и поймайте его в методе main
 *  Отловите и залогируйте начало вызова метода с ошибкой и саму ошибку уровнем INFO и WARNING соответственно
 */

public class Main {
    private static final Logger LOGGER = Logger.getGlobal();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            LOGGER.info("Начало вызова метода с ошибкой на уровне INFO");
            methodWithException();
        } catch (IOException e) {
            LOGGER.warning("Произошла ошибка на уровне WARNING "+ e.getMessage());}
        }

    public static void methodWithException() throws IOException {
    throw new IOException("Тот самый прикол");
    }
    }

