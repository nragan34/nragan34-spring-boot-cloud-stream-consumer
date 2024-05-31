package com.example.springcloudstream.service.event.sink

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.SubscribableChannel

interface SampleEventListenerSink {
    static final String SAMPLE_INBOUND_TOPIC = "sample:transfer-event"

    @Input(SAMPLE_INBOUND_TOPIC)
    SubscribableChannel inboundSampleEvents()
}
