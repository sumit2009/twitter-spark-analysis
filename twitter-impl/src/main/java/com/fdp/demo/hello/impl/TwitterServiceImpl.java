/*
 * Copyright (C) 2016-2017 Lightbend Inc. <https://www.lightbend.com>
 */
package com.fdp.demo.hello.impl;

import akka.NotUsed;
import com.fdp.demo.hello.api.TwitterService;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import java.util.concurrent.CompletableFuture;

/**
 * Implementation of the HelloService.
 */
public class TwitterServiceImpl implements TwitterService {


    @Override
    public ServiceCall<NotUsed, String> startAnalysis(String id) {
        return req -> CompletableFuture.completedFuture("Analysis output");

    }
}
