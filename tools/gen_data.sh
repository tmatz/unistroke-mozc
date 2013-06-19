#!/bin/bash

# goto source root
cd `dirname $0`/..

# generate .pic data
python tools/gen_mozc_drawable.py "--svg_dir=data/images/svg" "--output_dir=res/raw"
