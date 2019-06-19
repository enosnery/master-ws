package utils;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

import java.text.ParseException;
import java.util.Locale;

/**
 * Classe utilitária para ações relacionadas a entidades de data.
 */
public abstract class DateUtil {

    /**
     * Formato padrão de armazenamento de data no banco de dados.
     */
    public static final String DEFAULT_DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * Formato padrão de armazenamento de data no banco de dados.
     */
    public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

    /**
     * Formato padrão de exibição e recuperação de data nas views.
     */
    public static final String DEFAULT_VIEW_DATE_PATTERN = "dd/MM/yyyy";

    /**
     * Formato padrão de exibição para utilizasa no JavaScript
     */
    public static final String DEFAULT_VIEW_DATE_JS_PATTERN = "dd/mm/yyyy";
    /**
     * Padrão de data brasileira.
     */
    public static final String DATE_PATTERN_BR = "dd/MM/yyyy";

    /**
     * Padrão de hora brasileira.
     */
    public static final String HOUR_PATTERN_BR = "HH:mm:ss";

    /**
     * Padrão de data/hora brasileira.
     */
    public static final String DATE_HOUR_PATTERN_BR = "dd/MM/yyyy HH:mm:ss";

    /**
     * Padrão de data/hora brasileira, sem os segundos.
     */
    public static final String DATE_HOUR_WITHOUT_SECONDS_PATTERN_BR = "dd/MM/yyyy HH:mm";

    /**
     * Responsável por transformar uma string em padrão para uma entidade Date.
     * @param dateHour
     * @return
     * @throws ParseException
     */
    public static DateTime parse(String dateHour, String pattern) throws ParseException {
        if (dateHour == null || dateHour.isEmpty()) {
            return null;
        }

        if (pattern == null || pattern.isEmpty()) {
            pattern = DEFAULT_DATE_TIME_PATTERN;
        }

        return DateTime.parse(dateHour, DateTimeFormat.forPattern(pattern));
    }

    /**
     * Método responsável por ler uma classe Date e transforma-la em String no formato passado.
     * @param dateHour
     * @return formattedDate
     */
    public static String format(DateTime dateHour) {
        return format(dateHour, DATE_HOUR_WITHOUT_SECONDS_PATTERN_BR);
    }

    /**
     * Método responsável por ler uma classe Date e transforma-la em String no formato passado.
     * @param dateHour
     * @param pattern
     * @return formattedDate
     */
    public static String format(DateTime dateHour, String pattern) {
        if (dateHour == null) {
            return "";
        }

        if (pattern == null || pattern.isEmpty()) {
            pattern = DEFAULT_DATE_TIME_PATTERN;
        }

        return dateHour.toString(pattern, Locale.forLanguageTag("pt-BR"));
    }

    /**
     * Responsável por transformar uma string em padrão para uma entidade Date.
     * @param dateHour
     * @return
     * @throws ParseException
     */
    public static LocalDate parseLocalDate(String dateHour, String pattern) throws ParseException {
        if (dateHour == null || dateHour.isEmpty()) {
            return null;
        }

        if (pattern == null || pattern.isEmpty()) {
            pattern = DEFAULT_DATE_TIME_PATTERN;
        }

        return LocalDate.parse(dateHour, DateTimeFormat.forPattern(pattern));
    }

    /**
     * Método responsável por ler uma classe Date e transforma-la em String no formato passado.
     * @param dateHour
     * @param pattern
     * @return formattedDate
     */
    public static String format(LocalDate dateHour, String pattern) {
        if (dateHour == null) {
            return "";
        }

        if (pattern == null || pattern.isEmpty()) {
            pattern = DEFAULT_DATE_TIME_PATTERN;
        }

        return dateHour.toString(pattern);
    }

}