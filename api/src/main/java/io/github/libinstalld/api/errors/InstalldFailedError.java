package io.github.libinstalld.api.errors;

/**
 * Thrown to indicate that a hook failed due to framework internal error.
 */
@SuppressWarnings("unused")
public class InstalldFailedError extends InstalldFrameworkError {

    public InstalldFailedError(String message) {
        super(message);
    }

    public InstalldFailedError(String message, Throwable cause) {
        super(message, cause);
    }

    public InstalldFailedError(Throwable cause) {
        super(cause);
    }
}
