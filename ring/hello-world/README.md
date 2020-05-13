# hello-world

A Clojure library designed to ... well, that part is up to you.

## Notes

- install:
<pre>
lein new hello-world
cd hello-world
</pre>

- add deps in project.clj:

<pre>
[ring/ring-core "1.8.1"]
[ring/ring-jetty-adapter "1.8.1"]
</pre>

- download deps:

<pre>lein deps</pre>

- run
<pre>
(use 'ring.adapter.jetty)
(use 'hello-world.core)
(run-jetty handler {:port 3000 :join? false})
</pre>
