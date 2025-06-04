package io.github.libinstalld.api.errors;

/**
 * Thrown to indicate that the Xposed framework function is broken.
 */
public class InstalldFrameworkError extends Error {

    public InstalldFrameworkError(String message) {
        super(message);
    }

    public InstalldFrameworkError(String message, Throwable cause) {
        super(message, cause);
    }

    public InstalldFrameworkError(Throwable cause) {
        super(cause);
    }
}
