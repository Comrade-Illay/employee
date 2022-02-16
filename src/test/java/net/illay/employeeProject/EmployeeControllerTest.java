package net.illay.employeeProject;

import net.illay.employeeProject.controller.EmployeeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private EmployeeController employeeController;

    @Test
    public void employeeGetByIdTest() throws Exception{
        this.mockMvc.perform(get("/api/service/employee/1"))
                .andDo(print())
                .andExpect(jsonPath("$.employeeName").value("Mike"))
                .andExpect(status().isOk());
    }

    @Test
    public void employeeGetAllTest() throws Exception{
        this.mockMvc.perform(get("/api/service/employee/"))
                .andDo(print())
                .andExpect(jsonPath("$.*").isNotEmpty())
                .andExpect(jsonPath("$.*", hasSize(5)))
                .andExpect(status().isOk());
    }
}
