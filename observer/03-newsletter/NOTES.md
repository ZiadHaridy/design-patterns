# 03 - Newsletter

## The Problem (Bad Version)

`publish()` hardcodes every recipient. There's no way to add or remove subscribers at runtime.

## The Fix (Good Version)

`Subscriber` interface + a dynamic `List<Subscriber>`. Subscribers self-register and self-remove. The publisher just loops.

## Key Takeaway

Observer is the backbone of publish-subscribe systems. Email newsletters, RSS feeds, message brokers, and event buses all use this structure.
