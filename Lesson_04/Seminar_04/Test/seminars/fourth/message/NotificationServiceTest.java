package seminars.fourth.message;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class NotificationServiceTest {

    @Test
    void messageTest() {
        MessageService messageMock = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageMock);
        notificationService.sendNotification("message", "name");
        verify(messageMock).sendMessage("message", "name");
    }

}