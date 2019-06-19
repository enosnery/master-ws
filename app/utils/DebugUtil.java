package utils;

import org.joda.time.DateTime;
import play.Logger;

/**
 * Classe auxiliar para Debug em log do sistema.
 */
public abstract class DebugUtil {

    /**
     * Tag default do log.
     */
    public static final String DEFAULT_TAG = "GW-COLETOR";

    /**
     * Padrão default do log.
     */
    private static final String MESSAGE_PATTERN = "[%s] %s >>> %s";

    /**
     * Padrão default para logs complexos.
     */
    private static final String DEBUG_START = ">>>>>> DEBUG START <<<<<<";

    /**
     * Padrão default para logs complexos.
     */
    private static final String DEBUG_END = ">>>>>> DEBUG END <<<<<<";

    /**
     * Log de modo DEBUG do sistema.
     * @param tag - Tag
     * @param mensagens - Mensagens em Array
     */
    public static void d(String tag, String... mensagens) {
        d(tag, DEBUG_START);
        if (mensagens != null && mensagens.length > 0) {
            for (String mensagem : mensagens) {
                d(tag, mensagem);
            }
        }
        d(tag, DEBUG_END);
    }

    /**
     * Log de modo DEBUG do sistema.
     * @param mensagem - Mensagem a ser salva.
     */
    public static void d(String mensagem) {
        d(DEFAULT_TAG, mensagem);
    }

    /**
     * Log de modo DEBUG do sistema.
     * @param tag - Tag
     * @param mensagem - Mensagem a ser salva.
     */
    public static void d(String tag, String mensagem) {
        DateTime now = DateTime.now();
        Logger.debug(String.format(MESSAGE_PATTERN, DateUtil.format(now, DateUtil.DATE_HOUR_PATTERN_BR), tag, mensagem));
    }

    /**
     * Log de modo WARNING do sistema.
     * @param mensagem - Mensagem a ser salva.
     */
    public static void w(String mensagem) {
        w(DEFAULT_TAG, mensagem);
    }

    /**
     * Log de modo WARNING do sistema.
     * @param tag - Tag
     * @param mensagem - Mensagem a ser salva.
     */
    public static void w(String tag, String mensagem) {
        DateTime now = DateTime.now();
        Logger.warn(String.format(MESSAGE_PATTERN, DateUtil.format(now, DateUtil.DATE_HOUR_PATTERN_BR), tag, mensagem));
    }

    /**
     * Log de modo INFORMATION do sistema.
     * @param mensagem - Mensagem a ser salva.
     */
    public static void i(String mensagem) {
        i(DEFAULT_TAG, mensagem);
    }

    /**
     * Log de modo INFORMATION do sistema.
     * @param tag - Tag
     * @param mensagem - Mensagem a ser salva.
     */
    public static void i(String tag, String mensagem) {
        DateTime now = DateTime.now();
        Logger.info(String.format(MESSAGE_PATTERN, DateUtil.format(now, DateUtil.DATE_HOUR_PATTERN_BR), tag, mensagem));
    }

    /**
     * Log de modo ERROR do sistema.
     * @param mensagem - Mensagem a ser salva.
     */
    public static void e(String mensagem) {
        e(DEFAULT_TAG, mensagem);
    }

    /**
     * Log de modo ERROR do sistema.
     * @param tag - Tag
     * @param mensagem - Mensagem a ser salva.
     */
    public static void e(String tag, String mensagem) {
        DateTime now = DateTime.now();
        Logger.error(String.format(MESSAGE_PATTERN, DateUtil.format(now, DateUtil.DATE_HOUR_PATTERN_BR), tag, mensagem));
    }

    /**
     * Log de modo ERROR do sistema.
     * @param exception - Exceção a ser salva.
     */
    public static void e(Exception exception) {
        e(DEFAULT_TAG, exception);
    }

    /**
     * Log de modo ERROR do sistema.
     * @param tag - Tag
     * @param exception - Exceção a ser salva.
     */
    public static void e(String tag, Exception exception) {
        DateTime now = DateTime.now();
        Logger.error(String.format(MESSAGE_PATTERN, DateUtil.format(now, DateUtil.DATE_HOUR_PATTERN_BR), tag, exception.toString()));
    }

}