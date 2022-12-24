package com.learnkafka.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
// Consider this as the message object sent to Topic
public class LibraryEvent{
    // we will use this as the Key
    private Integer libraryEventId;
    private Book book;
}