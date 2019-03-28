
#  LDkit  [![](https://img.shields.io/badge/Issues-0%2B-brightgreen.svg)](https://github.com/tangyou79/LDkits) [![](https://img.shields.io/badge/Release-v1.0.0-blue.svg)](https://github.com/tangyou79/LDkit)

## a parallel computing toolkit for linkage disequilibrium analysis
</br>
<p align="center">
![](data:image/*;base64,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)
</p>

</br>


- [Pre-requirement](##Pre-requirement)
- [Installation](##Installation)
- [File Format](##FileFormat)
    - [Genotype](###Genotype:)
    - [Subgroup](###Subgroup:)
- [Usage](##Usage:)
    - [Run using Graphic User Interface (GUI)](###Run)
    - [Steps for LD analysis](##)
        - [Step1: choose input files](##)
        - [Step2: set parameters for filtering variants](##)
        - [Step3: choose LD types](##)
        - [Step4: set parameters for plotting](##)
        - [Step5: checking your settings]()
        - [Step6: Run]
        - [Notes]
    - [Run using command line](##)
        - [Step1: LD analysis]
        - [Step 2: Plot)
- [Examples](##Examples:)

##Pre-requirement

</br>


**JDK1.8 or above. It can be downloaded at:**

**[http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
**

</br>
##Installation
</br>
**LDkit is free of installation.**

GUI package is under the GUI folder, please double-click the LDkit\_GUI.jar to start.

Executable file **LDkit.jar** for command line users is on the executable folder

</br>

##File Format

###Genotype:

Both PLINK ped and map format  and VCF format  are supported. VCF format could be compressed or uncompressed.

###Subgroup:

Subgroup should be formatted as:

        [subgroup1Name]:sample1,sample2,sample3…
        [subgroup2Name]:sample1,sample2,sample3…


</br>

##Usage:

###Run using Graphic User Interface (GUI):

**GUI of LDkit is very easy to use. The main interface is like below:**
<p align="center" >
<a>
<img src="results/G2P_logo.png" height="250px" width="450px">
</a>
</p>

**Figure1: Interface of LDkit**

</br>

###Steps for LD analysis:


####Step1: choose input files

<p align="center" >
<a>
<img src="results/G2P_logo.png" height="250px" width="450px">
</a>
</p>

1 Genotype file could be dragged into the window;

2 Multiple genotype files could be put in the same folder, and then choose the folder as input

3 Other files must choose from disk.

</br>

####Step2: set parameters for filtering variants

 
<p align="center" >
<a>
<img src="results/G2P_logo.png" height="250px" width="450px">
</a>
</p>

Window size: max distance between two variants (kb) for LD decay.

Missing rate: max ration of missing allele in the population.

Thread num: number of threads. Default is half of the available resources.

MAF: minor allele frequency

Output file: save output.

</br>

####Step3: choose LD types

<p align="center" >
<a>
<img src="results/G2P_logo.png" height="250px" width="450px">
</a>
</p>

Three types of LD analysis are supported by LDkit.  
LD site refer to the LD between a given site and a given region.

</br>

####Step4: set parameters for plotting

1. This step could be skipped if you want to plot with other software.

2. If you want to plot with previous results, you could just input the previous results and adjust the parameters here. You needn&#39;t to run step1-step3 again.

<p align="center" >
<a>
<img src="results/G2P_logo.png" height="250px" width="450px">
</a>
</p>

InFile: none or previous results generated by LDkit.

Merge: if your input is a folder with multiple files, you could merge them all together as one population.

Mergechr: If your input is a file with multiple chromosomes, you could plot each chromosome by choosing no.

Bin: the size of bin for calculating mean r2 or D’. 

ResultName: file name for output.

</br>

####Step5: choose LD measurements

<p align="center" >
<a>
<img src="results/G2P_logo.png" height="250px" width="450px">
</a>
</p>

r2 or D’ could be chose here. 

</br>

####Step5: checking your settings

Before you click start, you could check your parameters at right bottom.

<p align="center" >
<a>
<img src="results/G2P_logo.png" height="250px" width="450px">
</a>
</p>

</br>

####Step6: Run

After clicking the start button, the dynamic DNA strand shown above will run.

####Notes:

1. If your input is a folder, you should make sure there is only file format. If more than one format in the folder, only the first appeared one will be used;

2. Do not support multiple files input for PLINK format;

3. PLINK format must be .ped and .map file suffix;

</br>

##Run using command line

###Step1: LD analysis:

java -jar LDkit.jar --input \&lt;input files\&gt; --output \&lt;output file\&gt; [parameters]

Parameters:

--input: input file or folder

--output: output file

--ws: max distance between two variants (kb) for LD decay. Default is 100 Kb.

--subpop: input of subgroup files;

--chr: chromosome name if you just want to calculate one or some of them. Multiple chromosomes should be separated by comma. Default is all.

--maf: minor allele frequency filter. Default is 0.005;

--threads: number of threads, default is 1.

--type: measurements of LD. 1 for r-sqaure, 2 for D prime. Default is 1.

--Intermediate save the LD file for LD block or not. Default is no.

--block: chr:start-end. Region for LD block or LD site. For example: chr1:1000-20000;

--site: chr:start-end chr:site. Given site for LD site. For example: chr1:1000-2000 chr1:24556--h: help

</br>

###Step 2: Plot

java -jar LDkit.jar --plot --input \&lt;input files\&gt; --output \&lt;output file\&gt; [parameters]

Parameters:

--inp: input file for plot

--merge: plot all subgroups in one figure or not. Default is yes.

--mergechr: plot all chromosomes or not. Default is yes.

--bin: the size of bin for calculating mean r2 or D&#39;.

</br>

##Examples:

1. **LD decay for one population**
2. **LD decay for partial chromosomes in a population**
3. **LD decay for multiple subpopulations**
4. **LD block analysis**
5. **LD site analysis**
