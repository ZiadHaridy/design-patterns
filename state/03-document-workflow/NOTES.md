# 03 - Document Workflow

## The Problem (Bad Version)

`Document` has a `String state` and every action method (`submit`, `approve`, `reject`, `archive`) has an `if/else` for every state. 4 states × 4 actions = 16 conditional branches in one class.

## The Fix (Good Version)

`DocumentState` interface with 4 concrete states. Each state contains exactly its 4 behavior lines. `ReviewState.reject()` sets the state back to `DraftState` — the transition is localized and obvious.

## Key Takeaway

CMS systems, issue trackers, order workflows, and CI/CD pipelines all model state machines. The State pattern is exactly their shape.
