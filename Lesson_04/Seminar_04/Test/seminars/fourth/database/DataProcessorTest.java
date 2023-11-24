package seminars.fourth.database;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class DataProcessorTest {
    @Test
    void dataBaseTest() {

        Database database = mock(Database.class);
        when(database.query(anyString())).thenReturn(Arrays.asList("Data1", "Data2", "Data3"));
        DataProcessor dataProcessor = new DataProcessor(database);

        List<String> result = dataProcessor.processData("Data");

        verify(database).query("Data");
        assertThat(result).hasSize(3);
    }

}