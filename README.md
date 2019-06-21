# practical
Practical exercise for interview

Scope
Customers should be able to select products from a list and add items to a basket.
Once in the basket, they can be processed for payment through the checkout, and once completed the order is final and cannot be changed.

Items can be moved back and forth, deleted or altered between the basket and checkout stage.

Each item is bought on a subscription basis with distinct payment intervals - currently stated as Weekly, Monthly or Annually - and each have their own term length.


Things yet to implement
- Including some form of auth. This is something I have not done before so is something I need to research and attempt further in order to include it.
- Moving items between tables was trickier than I first envisaged. Although I could get the scripts working in a way I wanted them to within mySQL, I wasn't able to transfer that over into the actual code.
- The ability to move a single item rather than the entire quantity. However, it probably makes more sense to just have "a product" to purchase and not worry about quantities. This could be solved by some database restructuring.
- Making it actually look useable...


Things to consider....
In future it would be nice to implement a custom term length and choose between different options for payment intervals.
The database structure could probably be improved as there is some duplication across tables which may not really be necessary.


What I've learned during this exercise
Although there is still a lot of work left to do, and it is probably a bit clunky in places, I've learned a quite a lot during the process. Every project I have done so far, throughout my learning, has been started from a pre-existing structure, some more in depth than others, so setting up a project from scratch was completely new to me. Once I'd figured out what I needed as a minimum though I was able to see what other libraries were available to help. Lombok was a library I had never used before which I was pleased to be able to include (albeit very limited use).

There is still a lot left to learn though....
