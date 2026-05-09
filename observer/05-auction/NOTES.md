# 05 - Auction

## The Problem (Bad Version)

`Auction` constructs `PhoneBidder` and `EmailBidder` and calls them directly. If Carol drops out mid-auction, nothing can be done without rewriting the class.

## The Fix (Good Version)

`BidObserver` is the interface. Bidders register and unregister themselves. The auction fans the bid event out to whoever is still registered.

## Key Takeaway

Auctions, live feeds, and any system where subscribers come and go at runtime are the clearest Observer use case. The key property is that the subject doesn't hard-code its audience.
