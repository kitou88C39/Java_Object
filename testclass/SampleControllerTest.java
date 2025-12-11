package testclass;

import java.beans.Transient;

@SpringBootTest
@AutoConfigureMockMvc
public class SampleControllerTest {

    // Spring MVCを呼び出すモック
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testMainMethod() throws Exception {

        this.mockMvc.perform(get("/sample"))// テスト実行
                .andExpect(status().isOK())// ステータス評価
                .andExpect(content().string("テスト1"));// 戻り値検証
    }
}
