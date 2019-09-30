package org.thebund1st.hankou.winning.lottery.adapters.http


import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcBuilderCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.test.web.servlet.setup.ConfigurableMockMvcBuilder

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print

@Configuration
class MockMvcBuilderCustomizers {

    @Bean
    MockMvcBuilderCustomizer alwaysDoPrint() {
        new MockMvcBuilderCustomizer() {

            @Override
            void customize(ConfigurableMockMvcBuilder builder) {
                builder.alwaysDo(print())
            }
        }
    }
}
