This is a simple hello world project created from the instructions at:

https://clojurescript.org/guides/quick-start

Prints "Hello, world!" at the

- repl
- browser alert
- browser console

## Notes

- the project name, folder and namespace is hello-world, but make sure the folder under src is hello_world and not hello-world

## Common Commands

- compile:

(unix/mac)
clj --main cljs.main --compile hello-world.core --repl

(windows)
java -cp "cljs.jar;src" cljs.main --compile hello-world.core --repl

- recompile & reload:

(require '[hello-world.core :as hello] :reload)

- help

(unix/mac)
clj -m cljs.main --help

(windows)
java -cp "cljs.jar;src" cljs.main --help


