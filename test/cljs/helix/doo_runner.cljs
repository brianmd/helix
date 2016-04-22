(ns helix.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [helix.core-test]))

(doo-tests 'helix.core-test)

