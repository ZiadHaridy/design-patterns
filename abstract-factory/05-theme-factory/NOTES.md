# 05 - Theme Factory

## The Problem (Bad Version)

`Form.render(theme)` checks the theme string for every widget. A missed branch silently produces a half-light, half-dark form.

## The Fix (Good Version)

Themed widget interfaces (`ThemedButton`, `ThemedTextField`) and a `ThemeFactory` that produces both. `LightThemeFactory` and `DarkThemeFactory` only ever produce their own family.

```java
new Form(new LightThemeFactory()).render();
new Form(new DarkThemeFactory()).render();
```

Adding "High-Contrast" is a new factory + new widgets. The form code is untouched.

## Key Takeaway

This is the classic theming use case. The same shape applies to localization (English/Arabic widgets), accessibility modes, A/B test variants, or any "swap a coordinated set" requirement.
