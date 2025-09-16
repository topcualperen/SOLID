# Java ile SOLID Prensipleri Örnekleri

Bu repo, nesne yönelimli tasarımın beş SOLID ilkesinin her biri için Java örnekleri sunmaktadır. Her ilke için, ilkeyi ihlal eden kodu gösteren bir "kötü örnek" (`bad-example`) ve kodu ilkeye uyacak şekilde nasıl yeniden düzenleyeceğinizi gösteren bir "iyi örnek" (`good-example`) bulunmaktadır.

## SOLID Prensipleri

SOLID, yazılım tasarımlarını daha anlaşılır, esnek ve sürdürülebilir hale getirmeyi amaçlayan beş tasarım ilkesinin bir kısaltmasıdır.

1.  [Single Responsibility Principle (SRP)](#single-responsibility-principle-srp)
2.  [Open/Closed Principle (OCP)](#openclosed-principle-ocp)
3.  [Liskov Substitution Principle (LSP)](#liskov-substitution-principle-lsp)
4.  [Interface Segregation Principle (ISP)](#interface-segregation-principle-isp)
5.  [Dependency Inversion Principle (DIP)](#dependency-inversion-principle-dip)

---

### Single Responsibility Principle (SRP)

> Bir sınıfın değişmek için yalnızca bir nedeni olmalıdır.

Bu, bir sınıfın yalnızca bir işi veya sorumluluğu olması gerektiği anlamına gelir. Bu ilkeye uymayan bir örnek `single-responsibility/bad-example` klasöründe, `Main.java` sınıfı içinde bulunabilir. Düzeltilmiş hali ise `single-responsibility/good-example` klasöründeki `Main.java` sınıfındadır.

-   **Kötü Örnek:** [`solid/single-responsibility/bad-example/Main.java`](solid/single-responsibility/bad-example/Main.java)
-   **İyi Örnek:** [`solid/single-responsibility/good-example/Main.java`](solid/single-responsibility/good-example/Main.java)

---

### Open/Closed Principle (OCP)

> Yazılım varlıkları (sınıflar, modüller, fonksiyonlar vb.) genişletmeye açık, ancak değiştirmeye kapalı olmalıdır.

Bu, mevcut kodu değiştirmeden yeni işlevler ekleyebilmeniz gerektiği anlamına gelir. Örnekler `open-closed` klasöründe bulunabilir.

**OCP Açısından:**
"Yeni şekil eklediğimde CalculateArea sınıfını değiştirmek zorunda mıyım?" → Hayır!

**LSP Açısından:**
"Bütün Shape implementasyonları birbirinin yerine geçebilir mi?" → Evet!

-   **Örnekler:** [`solid/open-closed/`](solid/open-closed/)

---

### Liskov Substitution Principle (LSP)

> Alt türler, temel türlerinin yerine geçebilir olmalıdır.

Bu, bir üst sınıfın nesnelerinin, programın doğruluğunu etkilemeden bir alt sınıfın nesneleriyle değiştirilebilmesi gerektiği anlamına gelir. Örnekler `liskov-substitution` klasöründe bulunabilir.

LSP - Liskov Substitution Principle:

Odağı: Türetilmiş sınıfların, temel sınıf/interface yerine kullanılabilmesi
Test ettiği şey: Rectangle ve Square nesnelerini Shape referansıyla kullanabilir miyiz?
Temel soru: "Bu nesneler birbirlerinin yerine geçebilir mi?"

-   **Örnekler:** [`solid/liskov-substitution/`](solid/liskov-substitution/)

---

### Interface Segregation Principle (ISP)

> Müşteriler, kullanmadıkları arayüzlere bağımlı olmaya zorlanmamalıdır.

Bu, daha büyük arayüzlerin daha küçük, daha spesifik olanlara bölünmesi gerektiği anlamına gelir, böylece müşterilerin yalnızca kendileriyle ilgili yöntemler hakkında bilgi sahibi olmaları gerekir. Örnekler `interface-segregation` klasöründe bulunabilir.

-   **Örnekler:** [`solid/interface-segregation/`](solid/interface-segregation/)

---

### Dependency Inversion Principle (DIP)

> 1.  Yüksek seviyeli modüller, düşük seviyeli modüllere bağımlı olmamalıdır. Her ikisi de soyutlamalara bağımlı olmalıdır.
> 2.  Soyutlamalar ayrıntılara bağlı olmamalıdır. Ayrıntılar soyutlamalara bağlı olmalıdır.

Bu, sınıfların somut uygulamalar yerine soyutlamalara (örneğin arayüzlere) bağımlı olması gerektiği anlamına gelir. Örnekler `dependency-inversion` klasöründe bulunabilir.

-   **Örnekler:** [`solid/dependency-inversion/`](solid/dependency-inversion/)

## Kaynak
Deepseek, Gemini