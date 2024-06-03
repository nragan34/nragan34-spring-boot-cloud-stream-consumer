package com.springcloudstream.example.driver.configuration

import com.springcloudstream.example.service.event.sink.SampleEventListenerSink
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.context.annotation.Configuration

@Configuration
@EnableBinding([SampleEventListenerSink])
class EventConfiguration {
}