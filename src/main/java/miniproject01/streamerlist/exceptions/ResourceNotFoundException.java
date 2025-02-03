package miniproject01.streamerlist.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -7994740953532861726L;

	public ResourceNotFoundException(String message) {
        super(message);
    }
}
