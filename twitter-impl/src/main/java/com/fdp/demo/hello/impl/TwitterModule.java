/*
 * Copyright (C) 2016-2017 Lightbend Inc. <https://www.lightbend.com>
 */
package com.fdp.demo.hello.impl;

import com.fdp.demo.hello.api.TwitterService;
import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

/**
 * The module that binds the HelloService so that it can be served.
 */
public class TwitterModule extends AbstractModule implements ServiceGuiceSupport {
  @Override
  protected void configure() {
    bindService(TwitterService.class, TwitterServiceImpl.class);
  }
}
